/*展示数据1-new Vue 2.组件元素 3.li组件修改*/
var result = [{title:'整租 · 水岸金桥苑 · 1居室',price:'2000元/月'},{title:'整租 · 水岸金桥苑 · 3居室',price:'3000元/月'},{title:'整租 · 水岸金桥苑 · 4居室',price:'5000元/月'},{title:'整租 · 水岸金桥苑 · 5居室',price:'2000元/月'},{title:'整租 · 水岸金桥苑 · 6居室',price:'3000元/月'},{title:'整租 · 水岸金桥苑 · 7居室',price:'5000元/月'}];

/*条目:条目标题+条目信息*/
/*addr跳转地址,texts条目内容,id:内容对应id*/
var arrs=[{title:'湛江',arr:[{addr:'http://www.baidu.com',texts:'霞山',id:'001'},{addr:'#',texts:'3'},{addr:'#',texts:'霞山'},{addr:'#',texts:'霞山'},{addr:'#',texts:'霞山'}]},{title:'广州',arr:[{addr:'#',texts:'2'},{addr:'#',texts:'3'}]},{title:'湛江',arr:[{addr:'#',texts:'霞山'},{addr:'#',texts:'3'}]},];
		
		Vue.component('house-gallery', {
   props:["item"],//指定v-bing:item 的值
   template:'#gallery-template',
    });

 //展示
  var vm = new Vue({
    el:'#house-gallery',
      data (){
          return{
              result:[],
              gallerylength:0,
          }
      },
      async mounted(){
          await axios.
          get("http://localhost:8080/testss?username=qq1")
              .then(response => {

                  console.log(response);
                  console.log(response.data);
                  this.result=response.data;
                  this.gallerylength=this.result.length;
                  console.log(this.gallerylength)

              })
              .catch(function (error) { // 请求失败处理
                  console.log(error);
              });
      },

    /*data:{
    result,
    }*/
  })
//分页+展示
Vue.component("page",{
    props:["item","gallerylength"],//指定v-bing:item 的值
    template:"#page-template",
    data(){
        var pagelinum = 3;
        var allpage = Math.ceil(this.gallerylength/pagelinum);
        alert("gallerylength"+vm.gallerylength);
        //异步获取长度问题------------------------------------------------------------------------------------------
        console.log(this.item);
        var showItem = 0;
        if(allpage<=9)
            showItem = allpage-1;
        else
            showItem = 6;
        return{
            biganindex: 1,//第n个数开始--------------------------------------------
            pagelinum,//每页li的个数--------------------------------------------
            current:1,   //当前页码
            showItem,  //显示页码 6 -1
            allpage, //总页数 当页码不大于10，无省略号
            preCli:false,
            backCli:true
        }
    },
    computed:{
        middlePages(){
            if(this.allpage <= 2){
                return 0;
            }else{
                return this.showItem - 1;
            }
        },
        bigLimit(){
            if(this.middlePages%2 == 0){
                console.log(this.middlePages);
                return this.allpage - (this.middlePages/2 + 1);
            }else{
                return this.allpage-Math.ceil(this.middlePages/2);
            }
        },
        offset(){
            if(this.current <= this.middlePages){
                return 2;
            }else if(this.current >= this.bigLimit){
                if(this.middlePages%2 == 0){
                    console.log(this.middlePages);
                    return this.bigLimit - (this.middlePages/2 - 1);
                }else{
                    return this.bigLimit - Math.floor(this.middlePages/2);
                }
            }else{
                // return this.current-Math.path(this.middlePages/2);
                if(this.middlePages%2 == 0){
                    console.log(this.middlePages);
                    return this.current-(this.middlePages/2 - 1);
                }else{
                    return this.current-Math.floor(this.middlePages/2);
                }
            }
        }
    },
    methods:{
        goto:function(index){
            // console.log(index);
            // console.log(this.current);
            if(index == this.current) return;
            this.biganindex=(index-1)*this.pagelinum+1;
            this.current = index;
            //这里可以发送ajax请求
        },

        decre:function(){
            // console.log('decre'+this.current)
            if(this.current != 1){
                this.current--;
                this.biganindex=this.biganindex-this.pagelinum;

                // console.log(this.current)
            }

        },
        incre:function(){
            if( this.current != this.allpage){
                this.current++;
                this.biganindex=this.biganindex+this.pagelinum;
            }

        }
    }
})
  
  
    //条目设置
    //选取变色
  new Vue({
      el:'#tiaomu',
				/*data:{
					arrs,
					selecton,
				},*/
      data (){
          return{
              arrs:[],//条目内容
              selecton:[],//选择、id、样式
          }
      },
      async  mounted(){
          await axios.
          get("http://localhost:8080/tiaomu")
              .then(response => {
               //异步点击无反应-----------------------------------------------------------------------------------不变色
                  this.arrs=response.data;
                  var selectcenter=new Array(this.arrs.length);
                  for(i=0;i<this.arrs.length;i++)
                  {
                      selectcenter[i]=new Array(this.arrs[i].arr.length);
                      selectcenter[i][0]={id:this.arrs[i].arr[0].id,selectonclass:'selecton'};
                      for(j=1;j<this.arrs[i].arr.length;j++)
                      {

                          selectcenter[i][j]={id:this.arrs[i].arr[j].id,selectonclass:'selectno'};

                         /* 二维数组
                          0 1 2 3
                        0 {id,selecton}---------------------------------------------------------------------------
                        1
                        2  */
                      }


                  }
                  this.selecton=selectcenter;



              })
              .catch(function (error) { // 请求失败处理
                  console.log(error);
              });
      },
      methods:{
					selectcolumn: function(indexs,index)
					{//id条目id
						
						//异步变化的部分------------------------------------------------------------------------------------
						for(i=0;i<this.selecton[indexs].length;i++)
						if(this.selecton[indexs][i].selectonclass=='selecton')
						Vue.set(this.selecton[indexs],i,{id:this.selecton[indexs][i].id,selectonclass:'selectno'});
						Vue.set(this.selecton[indexs],index,{id:this.selecton[indexs][index].id,selectonclass:'selecton'});
						var arrid = new Array(3);


						for (i=0;i<this.selecton.length;i++)
						    for (j=0;j<this.selecton[i].length;j++)
                             if (this.selecton[i][j].selectonclass=='selecton')
                             {
                                 arrid[i]=this.selecton[i][j].id;
                                 break;
                             }
						//id变色，三者传输-------------------------------------------------------------
                        axios.get('/updatagallery', {
                            params: {
                                a:arrid[0],
                                b:arrid[1],
                                c:arrid[2],
                            }
                        })
                            .then(function (response) {
                                vm.result=response.data;
                                console.log("sas"+vm.result);
                            })
                            .catch(function (error) {
                                console.log(error);
                            });

						
					}
				}
			});
//var result = [{title:'整租 · 水岸金桥苑 · 1居室',price:'2000元/月'},{title:'整租 · 水岸金桥苑 · 3居室',price:'3000元/月'},{title:'整租 · 水岸金桥苑 · 4居室',price:'5000元/月'},{title:'整租 · 水岸金桥苑 · 5居室',price:'2000元/月'},{title:'整租 · 水岸金桥苑 · 6居室',price:'3000元/月'},{title:'整租 · 水岸金桥苑 · 7居室',price:'5000元/月'}];





