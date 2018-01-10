package com.studyPro.springboot.controller;

import com.studyPro.springboot.base.BaseController;
import com.studyPro.springboot.base.Page;
import com.studyPro.springboot.dao.UserDao;
import com.studyPro.springboot.json.AjaxResult;
import com.studyPro.springboot.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Map;

/**
 * @author 范富强
 * @description
 * @date 2018/1/10 10:13
 */
@Controller
@RequestMapping("/user/")
@EnableAutoConfiguration
public class UserController extends BaseController{

    @Autowired
    private UserDao userDao;

    // 显示用户列表页面
    @RequestMapping("page")
    public String list() {
        return "index";
    }

    // 从user.jsp列表页面由easyui-datagrid发出ajax请求获取json数据
    @RequestMapping("/json")
    @ResponseBody
    public Map<String, Object> json(@RequestParam(name = "page", defaultValue = "1") int page,
                                    @RequestParam(name = "rows", defaultValue = "10") int rows, final String q) {

        List<UserInfo> userList = userDao.findAll();

        Page pp = new Page();
        pp.setCount(userList.size());
        pp.setRows(userList);

        return toEasyUIData(pp);
    }

    // 处理保存
    @RequestMapping("/save")
    @ResponseBody
    public AjaxResult save(UserInfo user) {
        userDao.insert(user);
        return new AjaxResult().success();
    }

    // 处理删除
    @RequestMapping("/delete")
    @ResponseBody
    public AjaxResult delete(Long id) {
        int a = 1 / 0;
        //userDao.delete(id);
        return new AjaxResult().success();
    }

}
