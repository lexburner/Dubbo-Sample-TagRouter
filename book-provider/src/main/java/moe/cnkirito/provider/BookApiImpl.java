package moe.cnkirito.provider;

import moe.cnkirito.api.BookApi;
import moe.cnkirito.api.GoodsApi;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;

/**
 * @author kirito.moe@foxmail.com
 * Date 2018-08-03
 */
@Service()
public class BookApiImpl implements BookApi {

    @Reference
    GoodsApi goodsApi;

    @Override
    public void sale() {
        System.out.println(RpcContext.getContext().getAttachments());
        System.out.println("hello book");
        // need to start Application goods-provider
        goodsApi.write();
    }

}
