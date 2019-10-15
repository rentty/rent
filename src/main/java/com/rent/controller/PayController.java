package com.rent.controller;


import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeCancelRequest;
import com.alipay.api.request.AlipayTradeCloseRequest;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradeRefundRequest;
import com.alipay.api.response.AlipayTradeCancelResponse;
import com.alipay.api.response.AlipayTradeCloseResponse;
import com.alipay.api.response.AlipayTradeRefundResponse;
import com.rent.bean.Order;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

@Controller
public class PayController {



    private final String APP_ID = "2016092500590169";
    private final String APP_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgw"
            + "ggSkAgEAAoIBAQDdtU6+BCmCpvhNi+vPR9uHPv+vnCQPtyYk9ZJRda8khMlUxZ2J1o1jD6u9ehH"
            + "YhJVagvCluwZe18W+XUVmVi1JtOLv8F8FKk2BKlFSOpe2EeP+5Vvat0Bl2fF+JxZ7QZTvfBsRNNs7K8"
            + "paPlTYfkmPSFY/RP1FnusP7viZ+F7fQWlQMG2MbvC7pMiQB7sMgwV/ar5LoZKAuoCpv3Gq/DEK1K91moPJN"
            + "Vjpfdzl/7ndUAPbfqi+bV9PUmSLDgGv8CTrEXkQ4QGbZBjNbrnuw0p7Z7jZvi0U42b6Gp7bzrxMUlTKfEfC43HQ6OHb"
            + "rVxIecZoSnuD49Bce6A2+by5u3sHAgMBAAECggEAStSvRyNQf3CrzkCzzrqKNhPlaPhik4tVrJPWVvhJrSHEcoBgs+1eu1jG"
            + "tqVE8LePUYVwg/+kHs7lR2Nj0S61CnOrRSD0cWHd1wLZf8+W9TUEpzvyzNedPMNa5yF6TQ/NnSdeW2hjto0JN3xiVtAJM/tOYPyAH8"
            + "eLv00BS7axDtj8PT/vlgLD1Hk81Xph98vCinN/PeeU8oLZao5Rg4bud1ezyz6gpDgPI2dGXfvjUm6AKO3jxxNm6DcwAJmUfiL7kYNl"
            + "XzbDhmHOrPPE0L2cCd4Fij7ooGBqetb05n4bR8acXkFaVDB0Z3WvMZfpxFKKgHbIWU3HN+tbTy/+/liCgQKBgQDzzuB2UHW/X7jWvvx9U"
            + "TFejcPgVpBdbGYr69atL1Lrtr/IFpPzOZHl4HNoM7komtZl1QbHWtOB3E/Zvioek5pIXujeOuGx2jTaPD2tcJYewm0k5eAhJkU2A67xEj1"
            + "4wfjn4m2CUk2plma7iNjJj2e4NZarpbJtEs4FozCoGMHCOQKBgQDoy4SXVsvN7j3GgFFtexc0EMiMdyn8w1Gxc0nAHDMzYwJZrkBLFraTZn"
            + "p224r5KRXfTg9L5eD+jZqohdvF8wxUHc7m6UzGNHwf74IiMsiRM+i3OYh2yNSw+KBFSZQ0wE4U/HP1+7Wf9GWOZgGH7xdA/jD6jI3IU16u6q90kSYnPwKBgQCzISFL7GvGsrakmOf7zua9+NycfB1PdrBOvtUYozeCVd/sS6JiRr8KLXG9cpss2S6C3RRA7luOAudsLMrXck0dtRXVCV//gznnyfDq+Fhjuyfjvz2APZUGTYiAOI2PpryQ6ozY/k1vN0C9sprM5J8o+b582J4Sg4l5HOBH8QCTCQKBgQDLILJ8X3cMJILwzwy+K/auLqrfricL7947qW5D3BdtEkp9uEdPfe0npvba+WxFRu1X4UQFpPtzAlpeDBcdnZs3Vp8v64hbNnbMYu+5KXjLAnFgVypVA55bIUavzqksclRviW0hyVXM0bM/0pApbZ1rz6ErLjOVBfILTKp2WyTgfwKBgAPFCR2c/4ILvVHB9UFrEf0hJ+6jr5a2UI0nygvhuBZNeRZgkTlliYKiscBBRFJYL9Fl16QQoVgsWIWJj79nRECopAXr6ChKRnfseP9msRHyrvQEvjQQEvc2ntREu8tWqdWQh7"
            + "jxakq39GgxTcESlBGtH6fdvYBGN3gS3p04+5AP";
    private final String CHARSET = "UTF-8";
    private final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA3bVOvgQpgqb4TYvrz0fbhz7/r5wkD7cmJPWSUXWvJITJVMWdidaNYw+rvXoR2ISVWoLwpbsGXtfFvl1FZlYtSbTi7/BfBSpNgSpRUjqXthHj/uVb2rdAZdnxficWe0GU73wbETTbOyvKWj5U2H5Jj0hWP0T9RZ7rD+74mfhe30FpUDBtjG7wu6TIkAe7DIMFf2q+S6GSgLqAqb9xqvwxCtSvdZqDyTVY6X3c5f+53VAD236ovm1fT1Jkiw4Br/Ak6xF5EOEBm2QYzW657sNKe2e42b4tFONm+hqe2868TFJUynxHwuNx0Ojh261cSHnGaEp7g+PQXHugNvm8ubt7BwIDAQAB";

    //这是沙箱接口路径,正式路径为https://openapi.alipay.com/gateway.do
    private final String GATEWAY_URL ="https://openapi.alipaydev.com/gateway.do";
    private final String FORMAT = "JSON";
    //签名方式
    private final String SIGN_TYPE = "RSA2";
    //支付宝异步通知路径,付款完毕后会异步调用本项目的方法,必须为公网地址
    private final String NOTIFY_URL = "http://localhost:8080/notifyUrl";
    //支付宝同步通知路径,也就是当付款完毕后跳转本项目的页面,可以不是公网地址
    private final String RETURN_URL = "http://localhost:8080/returnUrl";


    AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",APP_ID,APP_PRIVATE_KEY,"json","GBK",ALIPAY_PUBLIC_KEY,"RSA2");

    @ApiOperation(value = "交易支付接口",notes = "PC场景下单并支付")
    @RequestMapping("alipay")
    public void alipay( Order order, HttpServletResponse httpResponse,Model model) throws IOException {

        //获取从数据库通过订单编号获取订单详情
        //判断订单状态是否未支付,是则进入事务逻辑
        if (order != null && order.getOdStatus() == 0) {
            //实例化客户端,填入所需参数
            AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
            //在公共参数中设置回跳和通知地址
            request.setReturnUrl(RETURN_URL);
            request.setNotifyUrl(NOTIFY_URL);

            //商户订单号，商户网站订单系统中唯一订单号，必填
            //生成随机Id
            String out_trade_no = "111";
            //付款金额，必填
            String total_amount = "2222";
            //订单名称，必填
            String subject = "ceshi";
            //商品描述，可空
            String body = order.getOdRent()+"";
            request.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                    + "\"total_amount\":\""+ total_amount +"\","
                    + "\"subject\":\""+ subject +"\","
                    + "\"body\":\""+ body +"\","
                    +"\"time_expire\":\"30m\","
                    + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
            String form = "";
            try {
                form = alipayClient.pageExecute(request).getBody(); // 调用SDK生成表单

                System.out.println(alipayClient.pageExecute(request).getParams());
                System.out.println(alipayClient.pageExecute(request).getSubMsg());
                System.out.println(alipayClient.pageExecute(request).getSubCode());
                System.out.println("============================================");
                System.out.println(alipayClient.pageExecute(request).getMerchantOrderNo());
                System.out.println(alipayClient.pageExecute(request).getOutTradeNo());
                System.out.println(alipayClient.pageExecute(request).getSellerId());
                System.out.println(alipayClient.pageExecute(request).getTradeNo());

                //                JSON ob = (JSON) JSON.parse(form);
//                model.addAttribute("pay_response_json",ob);//model 添加 pay_response
            } catch (AlipayApiException e) {
                e.printStackTrace();
            }
            httpResponse.setContentType("text/html;charset=" + CHARSET);
            httpResponse.getWriter().write(form);// 直接将完整的表单html输出到页面
            httpResponse.getWriter().flush();
            httpResponse.getWriter().close();
        }else {
            //处理订单已支付过的错误调用
            System.out.println("something erro");
        }

    }



    @ApiOperation(value = "交易关闭接口",notes = "用于交易创建后，用户在一定时间内未进行支付，可调用该接口直" +
            "接将未付款的交易进行关闭")
    @RequestMapping("closePay")
    public void closePay(HttpServletResponse httpResponse) throws Exception {
        AlipayTradeCloseRequest request = new AlipayTradeCloseRequest();

        //
        String trade_no = "";
        //
        String out_trade_no = "";
        //
        String operator_id = "";

        request.setBizContent("{" +
                "\"trade_no\":\""+trade_no+"\"," +
                "\"out_trade_no\":\""+out_trade_no+"\"," +
                "\"operator_id\":\""+operator_id+"\"" +
                "  }");
        AlipayTradeCloseResponse response = alipayClient.execute(request);
        if(response.isSuccess()){
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
        }

    }

    @ApiOperation(value = "交易撤销接口",notes ="支付交易返回失败或支付系统超时，调用该接口撤销交易" )
    @RequestMapping("cancelPay")
    public void cancelPay(HttpServletResponse httpResponse, Model model) throws Exception {


        String out_trade_no = null;
        String trade_no = null;

        AlipayTradeCancelRequest request = new AlipayTradeCancelRequest();
        request.setBizContent("{" +
                "\"out_trade_no\":\""+out_trade_no+"\"," +
                "\"trade_no\":\""+trade_no+"\"" +
                "  }");
        AlipayTradeCancelResponse response = alipayClient.execute(request);
        if(response.isSuccess()){
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
        }

    }


    @ApiOperation(value = "交易退款接口",notes ="交易发生之后一段时间内，由于买家或者卖家的原因需要退款时卖家" +
            "可以通过退款接口将支付款退还给买家，支付宝将在收到退款请求并且验证成功之后，按照退款规则将支付款按原路退到买家帐号上" )

    @RequestMapping("refoundPay")
    public void refoundPay(HttpServletResponse httpResponse, Model model) throws Exception {


        //订单支付时传入的商户订单号
        String out_trade_no = "";
        //支付宝交易号
        String trade_no = "";
        //需要退款的金额，该金额不能大于订单金额
        String refound_amount = "";

        String refund_currency = "";
        String refunnd_reason = "";
        String out_request_no = "";
        String operator_id = "";
        String store_id = "";
        String terminal_id = "";
        //商品的编号
        String goods_id = "";
        String alipay_good_id = "";
        //商品名称
        String goods_name = "";
        //商品数量
        String quantity = "";
        //商品单价，单位为元
        String price = "";
        String goods_category = "";
        String categories_tree = "";
        String body = "";
        String show_url = "";

        String royalty_type = "";
        String trans_out = "";
        String trans_out_type = "";
        String trans_in_type = "";
        String trans_in = "";
        String amount = "";
        String amount_percentage = "";
        String desc = "";
        String org_pid = "";
        AlipayTradeRefundRequest request = new AlipayTradeRefundRequest();
        request.setBizContent("{" +
                "\"out_trade_no\":\""+out_trade_no+"\"," +
                "\"trade_no\":\""+trade_no+"\"," +
                "\"refund_amount\":"+refound_amount+"," +
                "\"refund_currency\":\""+refund_currency+"\"," +
                "\"refund_reason\":\""+refunnd_reason+"\"," +
                "\"out_request_no\":\""+out_request_no+"\"," +
                "\"operator_id\":\""+operator_id+"\"," +
                "\"store_id\":\""+store_id+"\"," +
                "\"terminal_id\":\""+terminal_id+"\"," +
                "      \"goods_detail\":[{" +
                "        \"goods_id\":\""+goods_id+"\"," +
                "\"alipay_goods_id\":\""+alipay_good_id+"\"," +
                "\"goods_name\":\""+goods_name+"\"," +
                "\"quantity\":"+quantity+"," +
                "\"price\":"+price+"," +
                "\"goods_category\":\""+goods_category+"\"," +
                "\"categories_tree\":\""+categories_tree+"\"," +
                "\"body\":\""+body+"\"," +
                "\"show_url\":\""+show_url+"\"" +
                "        }]," +
                "      \"refund_royalty_parameters\":[{" +
                "        \"royalty_type\":\""+royalty_type+"\"," +
                "\"trans_out\":\""+trans_out+"\"," +
                "\"trans_out_type\":\""+trans_out_type+"\"," +
                "\"trans_in_type\":\""+trans_in_type+"\"," +
                "\"trans_in\":\""+trans_in+"\"," +
                "\"amount\":"+amount+"," +
                "\"amount_percentage\":"+amount_percentage+"," +
                "\"desc\":\""+desc+"\"" +
                "        }]," +
                "\"org_pid\":\""+org_pid+"\"" +
                "  }");
        AlipayTradeRefundResponse response = alipayClient.execute(request);
        if(response.isSuccess()){
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
        }
    }

}



