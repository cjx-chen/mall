package com.liyuan.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liyuan.dao.MallGoodsMapper;
import com.liyuan.model.MallGoods;
import com.liyuan.model.MallGoodsExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class GoodsServiceImpl {
    @Resource
    private MallGoodsMapper goodsMapper;


    public PageInfo querySelective(String keyword, Integer page, Integer pageSize, String sort, String order, MallGoods.Column... columns) {
        MallGoodsExample goodsExample = new MallGoodsExample();
        goodsExample.setOrderByClause(sort + " " + order);
        MallGoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andNameLike("%" + keyword + "%");
        PageHelper.startPage(page, pageSize);
        List<MallGoods> mallGoods = goodsMapper.selectByExampleSelective(goodsExample, columns);
        return new PageInfo(mallGoods);
    }

    public PageInfo querySelective(Integer page, Integer pageSize, String sort, String order, MallGoods.Column... columns) {
        return querySelective("", page, pageSize, sort, order, columns);
    }

    public int insertSelective(MallGoods mallGoods) {
        mallGoods.setUpdateTime(LocalDateTime.now());
        return goodsMapper.insertSelective(mallGoods);
    }

    public MallGoods queryById(Integer goodsId, MallGoods.Column... columns) {
        return goodsMapper.selectByPrimaryKeySelective(goodsId, columns);
    }

    public int updateSelectiveById(MallGoods goods) {
        goods.setUpdateTime(LocalDateTime.now());
        return goodsMapper.updateByPrimaryKeySelective(goods);
    }

    public List<MallGoods> queryByBrandId(Integer brandId, MallGoods.Column... columns) {
        MallGoodsExample goodsExample = new MallGoodsExample();
        MallGoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andBrandIdEqualTo(brandId);
        return goodsMapper.selectByExampleSelective(goodsExample, columns);
    }

    public int deleteById(Integer goodsId) {
        return goodsMapper.deleteByPrimaryKey(goodsId);
    }
}
