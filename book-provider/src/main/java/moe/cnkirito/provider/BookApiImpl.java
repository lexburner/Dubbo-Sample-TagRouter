package moe.cnkirito.provider;

import moe.cnkirito.api.BookApi;
import moe.cnkirito.api.GoodsApi;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;

/**
 * @author 徐靖峰[OF2938]
 * Date 2018-07-31
 */
@Service()
public class BookApiImpl implements BookApi {

    @Reference
    GoodsApi goodsApi;

    @Override
    public void sale() {
        System.out.println(RpcContext.getContext().getAttachments());
        System.out.println("hello book");
        goodsApi.write();
    }

}
