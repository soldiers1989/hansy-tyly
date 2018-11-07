package com.hansy.tyly.merchants.goods.dao.model;

import javax.persistence.*;

@Table(name = "t_goods_distributor")
public class TGoodsDistributor {
    /**
     * 主键
     */
    @Id
    @Column(name = "table_key")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tableKey;

    /**
     * 商品编号
     */
    @Column(name = "goods_no")
    private String goodsNo;

    /**
     * 经销商编号
     */
    @Column(name = "distributor_no")
    private String distributorNo;

    /**
     * 商品库存量
     */
    @Column(name = "goods_stock")
    private Integer goodsStock;

    /**
     * 获取主键
     *
     * @return table_key - 主键
     */
    public Integer getTableKey() {
        return tableKey;
    }

    /**
     * 设置主键
     *
     * @param tableKey 主键
     */
    public void setTableKey(Integer tableKey) {
        this.tableKey = tableKey;
    }

    /**
     * 获取商品编号
     *
     * @return goods_no - 商品编号
     */
    public String getGoodsNo() {
        return goodsNo;
    }

    /**
     * 设置商品编号
     *
     * @param goodsNo 商品编号
     */
    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    /**
     * 获取经销商编号
     *
     * @return distributor_no - 经销商编号
     */
    public String getDistributorNo() {
        return distributorNo;
    }

    /**
     * 设置经销商编号
     *
     * @param distributorNo 经销商编号
     */
    public void setDistributorNo(String distributorNo) {
        this.distributorNo = distributorNo;
    }

    /**
     * 获取商品库存量
     *
     * @return goods_stock - 商品库存量
     */
    public Integer getGoodsStock() {
        return goodsStock;
    }

    /**
     * 设置商品库存量
     *
     * @param goodsStock 商品库存量
     */
    public void setGoodsStock(Integer goodsStock) {
        this.goodsStock = goodsStock;
    }
}