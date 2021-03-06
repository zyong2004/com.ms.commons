/*
 * Copyright 2011-2016 ZXC.com All right reserved. This software is the confidential and proprietary information of
 * ZXC.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with ZXC.com.
 */
package com.ms.commons.test.external.jyaml.org.ho.yaml.wrapper;

/**
 * @author zxc Apr 14, 2013 12:27:31 AM
 */
public interface SimpleObjectWrapper extends ObjectWrapper {

    @SuppressWarnings("rawtypes")
    public Class expectedArgType();

    public Object getOutputValue();
}
