package com.imooc.ad.service;

import com.imooc.ad.vo.CreativeRequest;
import com.imooc.ad.vo.CreativeResponse;

/**
 * Created by Lin ShiSheng.
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
