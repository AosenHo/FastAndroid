/*******************************************************************************
 * Copyright (c) 2017.   ShengJunHu
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 ******************************************************************************/

package com.hsj.base.app.ui;

import com.hsj.base.lib.ui.BaseActivity;

/**
 * @Author:HSJ
 * @E-mail:mr.ajun@foxmail.com
 * @Date:2017/5/27 14:52
 * @Class:AppBaseActivity
 * @Description:界面数据全部来源网络，继承此activity
 * 1、加载中、2、加载成功、3、加载失败、4、网络故障
 */
public abstract class AppBaseLoadActivity extends BaseActivity{

    public String TAG = this.getClass().getSimpleName();

    protected void initHttp(){

    }

}