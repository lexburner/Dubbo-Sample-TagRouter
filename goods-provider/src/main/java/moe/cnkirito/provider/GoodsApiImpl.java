package moe.cnkirito.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import moe.cnkirito.api.GoodsApi;

/**
 * @author 徐靖峰[OF2938]
 * Date 2018-08-07
 */
@Service
public class GoodsApiImpl implements GoodsApi {

    @Override
    public void write() {
        System.out.println(RpcContext.getContext().getAttachments());
        System.out.println("hello goods");
    }
}
