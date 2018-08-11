package moe.cnkirito.provider;

import moe.cnkirito.api.GoodsApi;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;

/**
 * @author kirito.moe@foxmail.com
 * Date 2018-08-03
 */
@Service
public class GoodsApiImpl implements GoodsApi {

    @Override
    public void write() {
        System.out.println(RpcContext.getContext().getAttachments());
        System.out.println("hello goods");
    }
}
