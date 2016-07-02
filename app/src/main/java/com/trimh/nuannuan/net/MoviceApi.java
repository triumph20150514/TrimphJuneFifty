package com.trimh.nuannuan.net;

import com.trimh.nuannuan.bean.MoviceBean;

import retrofit2.Retrofit;
import rx.Observable;
import rx.Subscriber;

/**
 * Project TrimphJuneFifty
 * Package_name com.trimh.nuannuan.net
 * Created by trimph on 2016/6/29.
 * Created by trimph  on 2016/6/29.
 */
public class MoviceApi {
    NetService netService;

    public MoviceApi() {
        //jianli
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://api.douban.com/v2/movie/").build();
        netService = retrofit.create(NetService.class);
    }

    public void getMovice(Subscriber<MoviceBean> subscriber, int start, int cont) {
        netService.getMovice(start, cont).subscribe(subscriber);


    }


}
