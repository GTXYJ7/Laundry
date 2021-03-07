package com.gtxyj.laundry_backend.homepage.service;

import com.gtxyj.laundry_backend.homepage.entity.Reservation;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gtxyj.laundry_backend.my.entity.Score;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author nbdnbb
 * @since 2021-03-01
 */
public interface IReservationService extends IService<Reservation> {
    List<Reservation> getresvlist(String user_id);
}
