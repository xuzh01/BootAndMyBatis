package com.example.demo.mapper;

import com.example.demo.entity.Goods;
import com.example.demo.entity.GoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    long countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExampleWithBLOBs(GoodsExample example);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKeyWithBLOBs(Goods record);

    int updateByPrimaryKey(Goods record);



    /**
     * 实现商品的分页查询
     * @param page
     * @param rowcount
     * @return
     */
    public List<Goods> findGoodsByPage(@Param("page") int page,@Param("rowcount") int rowcount);

    /**
     * 根据传入的商品ID进行商品的查询。属性为空不查询。不为空则按照条件查询
     * @param goodsInfo
     * @return
     */
    public List<Goods> findGoodsByExample(Goods goodsInfo);

    /**
     * 根据商品的价格范围进行查询
     * @param minprice 最低价
     * @param maxprice 最高价
     * @return
     */
    public List<Goods> findGoodsByPrice(@Param("minprice") int minprice,@Param("maxprice") int maxprice);

    /**
     * 通过商品ID 进行查询
     * @param goodsInfo
     * @return
     */
    public Goods findGoodsByGid(int goodsInfo);

    /**
     * 根据传入的一组商品ID查询
     * @param gid
     * @return
     */
    public int deleteGoodsByGids(Integer[] gid);

    /**
     * 添加商品信息
     * @param goodsInfo
     * @return
     */
    public int saveGoodsInfo(Goods goodsInfo);




}