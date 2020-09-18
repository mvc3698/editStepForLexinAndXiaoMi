/*
 *
 *  * Copyright 2020-2030 biuaxia(https://github.com/biuaxia)
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package cn.biuaxia.code.sport.lexin.service;

import cn.biuaxia.code.sport.lexin.domain.vo.IVO;

/**
 * 步数接口
 *
 * @author biuaxia
 * @date 2020-09-19 03:27:18
 */
public interface StepService {

    /**
     * 提交步数
     *
     * @param username 用户名
     * @param password 密码
     * @param step     步数
     * @return {@link IVO}
     */
    IVO submitStep(String username, String password, int step);

}
