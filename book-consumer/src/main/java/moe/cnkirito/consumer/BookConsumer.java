package moe.cnkirito.consumer;

import moe.cnkirito.api.BookApi;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 徐靖峰[OF2938]
 * Date 2018-07-31
 */
@RestController
public class BookConsumer {

    @Reference
    BookApi bookApi;

    @RequestMapping("/book")
    public String book() {
        RpcContext.getContext().setAttachment("request.tag","yellow");
        bookApi.sale();
        return "success";
    }

}
