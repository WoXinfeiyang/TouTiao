package com.chaychan.news.view;

import com.chaychan.news.model.entity.News;

import java.util.List;

/**
 * 获取各种频道广告的View回调接口
 * @author ChayChan
 * @description: 获取各种频道广告的View回调接口
 * @date 2017/6/18  9:33
 */

public interface lNewsListView {
    /**成功获取新闻列表回调方法*/
    void onGetNewsListSuccess(List<News> newList,String tipInfo);

    void  onError();
}
