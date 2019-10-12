# rent
租客系统
晓清是猪
wdnmd


redis作为缓存使用方法：  
在service上操作分2步  
1.为service添加标签  
@CacheConfig(cacheNames = "test",cacheManager = "cacheManager")//cacheNames的值相当于mysql表名  
2.在方法上添加标签  
@Cacheable（key=""）//添加在执行mysql查询语句的方法上  
@cacheEvict（key=""）//添加在执行mysql删除语句的方法上  
@cachePut（key=""）//添加在执行mysql修改语句的方法上  
key值：默认值是参数，传入是对象类型的参数需要指定一个属性来当key（这个属性区别于该类的其他对象---唯一性）  
实例：key="#User.id" key="#username"  


FastDfs文件系统使用：  
controller层  
```java
@PostMapping("/upload")  
public String fdfsUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {  


    try {  
        String fileUrl = dfsClient.uploadFile(file);//得到的是文件的访问地址  
    } catch (IOException e) {  
        e.printStackTrace();  
    }  


    return "index";  
}  
```
前端  
```haml
<form action="/upload" method="post" enctype="multipart/form-data">  
    <input type="file" name="file">  
    <input type="submit" value="提交">  
</form>  
```

```
