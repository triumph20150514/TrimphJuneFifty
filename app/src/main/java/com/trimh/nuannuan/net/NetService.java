package com.trimh.nuannuan.net;

import android.telecom.Call;

import com.trimh.nuannuan.bean.MoviceBean;

import java.util.Observer;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;
import rx.observers.Observers;

/**
 * @description:网络部分 Project TrimphJuneFifty
 * Package_name com.trimh.nuannuan.net
 * Created by 涛 on 2016/6/29.
 * Created by 涛  on 2016/6/29.
 */
public interface NetService {

    @GET("top250")
    Observable<MoviceBean> getMovice(@Query("start") int start, @Query("count") int count);

}
