package moe.cnkirito.consumer;

import moe.cnkirito.api.BookApi;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kirito.moe@foxmail.com
 * Date 2018-08-03
 */
@RestController
public class BookConsumer {

    @Reference
    BookApi bookApi;

    @RequestMapping("/book")
    public String book() {
        RpcContext.getContext().setAttachment("request.tag","red");
        // need to start Application book-provider
        bookApi.sale();
        return "success";
    }

}
