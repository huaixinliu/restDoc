package com.split.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.split.vo.BaseResultVo;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

@Controller
public class StudentController extends com.split.controller.BaseController
{
    private static final Log LOGGER = LogFactory.getLog(StudentController.class);

    @RequestMapping(value = "updateStudent", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ApiOperation(value = "修改学生信息", httpMethod = "POST", notes = "学生信息以json格式传递", response = BaseResultVo.class)
    public @ResponseBody String updateStudent(@ApiParam(required = true) @RequestParam String postData)
    {
        LOGGER.debug(String.format("enter function, %s", postData));
        return buildSuccessResultInfo(1);
    }

}
