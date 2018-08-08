package moe.cnkirito.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.RpcContext;
import moe.cnkirito.api.BookApi;
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
