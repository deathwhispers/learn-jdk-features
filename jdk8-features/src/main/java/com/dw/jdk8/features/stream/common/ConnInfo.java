package com.guangjian.jdk.features.stream.common;

import java.util.List;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2021/9/20 5:59 下午
 */
public class ConnInfo {

    private String domainType;
    private List<Integer> data;

    public ConnInfo(String domainType) {
        this.domainType = domainType;
    }

    public ConnInfo(String domainType, List<Integer> data) {
        this.domainType = domainType;
        this.data = data;
    }

    public String getDomainType() {
        return domainType;
    }

    public void setDomainType(String domainType) {
        this.domainType = domainType;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }
}
