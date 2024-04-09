package com.selab.selabojcodesandbox;


import com.selab.selabojcodesandbox.model.ExecuteCodeRequest;
import com.selab.selabojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
