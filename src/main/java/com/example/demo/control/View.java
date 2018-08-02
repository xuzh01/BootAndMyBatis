package com.example.demo.control;

import com.example.demo.entity.Goods;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.mapper.GoodsMapper;
import com.example.demo.mapper.RoleMapper;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/7/31.
 */
@RestController
public class View {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private GoodsMapper goodsMapper;

    @GetMapping("/list")
    @ResponseBody
    public List<User> getAll() {
        return userMapper.selectByExample(null);
    }

    @GetMapping("/listofUser")
    @ResponseBody
    public List<User> getAllAndRole() {
        return userMapper.findAll();
    }

    @GetMapping("/list2")
    @ResponseBody
    public List<User> get() {
        return userMapper.find();
    }

    @GetMapping("/getByRoleid")
    @ResponseBody
    public Role getUsersByRole(@RequestParam(value = "roleid", defaultValue = "1") int roleid) {
        return roleMapper.getAllUser(roleid);
    }

    @GetMapping("/page")
    @ResponseBody
    public List<Goods> getGoodsByPage(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "rowcount", defaultValue = "5") int rowcount) {
        return goodsMapper.findGoodsByPage(page, rowcount);
    }

    @GetMapping("/findGoodsById")
    @ResponseBody
    public List<Goods> findGoodsById(@RequestParam(value = "id", defaultValue = "1") int id) {
        if (id == 0) return null;
        else {
            Goods goods = new Goods();
            goods.setId(id);
            return goodsMapper.findGoodsByExample(goods);
        }
    }


    @GetMapping("/findGoodsByPrice")
    @ResponseBody
    public List<Goods> findGoodsByPrice(@RequestParam(value = "minprice", defaultValue = "1") int minprice, @RequestParam(value = "maxprice", defaultValue = "1") int maxprice) {
        return goodsMapper.findGoodsByPrice(minprice, maxprice);
    }

    @PostMapping("/addGoods")
    @ResponseBody
    public int addGoods(@RequestBody Goods goods){
        System.out.println(goods.getGoodsName());
        goods.setGoodsCreateTime(new Date());
        int i = goodsMapper.saveGoodsInfo(goods);
        return i;
    }

    @PostMapping("/delGoods")
    @ResponseBody
    public int delGoods(@RequestBody Integer[] ids){
        System.out.println("\n\n");
        for (Integer i:ids){
            System.out.print(i+"\t");
        }
        System.out.println("\n\n");
        int i = goodsMapper.deleteGoodsByGids(ids);
        return i;
    }
}

/*
代码手中走~佛祖心中留！求永无BUG！
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
            \  .-\__  `-`  ___/-. /
          ___`. .'  /--.--\  `. . __
       ."" '<  `.___\_<|>_/___.'  >'"".
      | | :  `- \`.;`\ _ /`;.`/ - ` : | |
      \  \ `-.   \_ __\ /__ _/   .-` /  /
 ======`-.____`-.___\_____/___.-`____.-'======
 */
