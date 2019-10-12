package com.rent.controller;


import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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



    @RequestMapping("alipay")
    public void alipay(HttpServletResponse httpResponse) throws IOException {

        //获取从数据库通过订单编号获取订单详情


        Random r=new Random();
        //实例化客户端,填入所需参数
        AlipayClient alipayClient = new DefaultAlipayClient(GATEWAY_URL, APP_ID, APP_PRIVATE_KEY, FORMAT, CHARSET, ALIPAY_PUBLIC_KEY, SIGN_TYPE);
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        //在公共参数中设置回跳和通知地址
        request.setReturnUrl(RETURN_URL);
        request.setNotifyUrl(NOTIFY_URL);

        //商户订单号，商户网站订单系统中唯一订单号，必填
        //生成随机Id
        String out_trade_no = "353733";
        //付款金额，必填
        String total_amount =Integer.toString(r.nextInt(999)+1000);
        //订单名称，必填
        String subject ="奥迪A8 2016款 A8L 60 TFSl quattro豪华型";
        //商品描述，可空
        String body = "尊敬的会员欢迎购买奥迪A8 2016款 A8L 60 TFSl quattro豪华型";
        request.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                + "\"total_amount\":\""+ total_amount +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"body\":\""+ body +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        String form = "";
        try {
            form = alipayClient.pageExecute(request).getBody(); // 调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        httpResponse.setContentType("text/html;charset=" + CHARSET);
        httpResponse.getWriter().write(form);// 直接将完整的表单html输出到页面
        httpResponse.getWriter().flush();
        httpResponse.getWriter().close();
    }




    @RequestMapping("notifyUrl")
    public void niotice(HttpServletResponse httpResponse) throws IOException {

    }




}



