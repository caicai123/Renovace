package com.renovace;

import com.renovace.Util.RenovaceLogUtil;

import io.reactivex.functions.Consumer;

/**
 * @author athoucai
 * @date 2018/10/11
 */
public class RenovaceErrorHandler implements Consumer<Throwable> {
    @Override
    public void accept(Throwable e) throws Exception {
        RenovaceLogUtil.logE("RenovaceErrorHandler intercept err :" + e.getMessage());
    }
}
