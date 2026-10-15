package com.genersoft.iot.vmp.media.abl.bean.hook;

/**
 * ABL on_publish 推流/码流接入鉴权事件参数
 * <pre>
 * {"app":"Media","stream":"Camera_00001","mediaServerId":"ABLMediaServer_00001",
 *  "mediaSourceCount":1,"networkType":50,"key":470,"ip":"44.35.33.248","port":554,"params":""}
 * </pre>
 */
public class OnPublishABLHookParam extends ABLHookParam {
    private String ip;
    private Integer port;
    private String params;
    /**
     * 当前媒体源数量
     */
    private Integer mediaSourceCount;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public Integer getMediaSourceCount() {
        return mediaSourceCount;
    }

    public void setMediaSourceCount(Integer mediaSourceCount) {
        this.mediaSourceCount = mediaSourceCount;
    }

    @Override
    public String toString() {
        return "OnPublishABLHookParam{" +
                "mediaServerId='" + getMediaServerId() + '\'' +
                ", app='" + getApp() + '\'' +
                ", stream='" + getStream() + '\'' +
                ", key='" + getKey() + '\'' +
                ", networkType=" + getNetworkType() +
                ", mediaSourceCount=" + mediaSourceCount +
                ", ip='" + ip + '\'' +
                ", port=" + port +
                ", params='" + params + '\'' +
                '}';
    }
}
