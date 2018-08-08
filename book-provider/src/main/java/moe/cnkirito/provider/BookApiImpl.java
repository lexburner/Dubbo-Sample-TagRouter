package moe.cnkirito.provider;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import moe.cnkirito.api.BookApi;
import moe.cnkirito.api.GoodsApi;

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
