package com.qcloud.cos.model.ciModel.job;

import com.qcloud.cos.internal.CIServiceRequest;
import com.qcloud.cos.model.ciModel.common.MediaInputObject;

import java.io.Serializable;

/**
 * 媒体处理 任务请求实体 https://cloud.tencent.com/document/product/460/48234
 */
public class MediaJobsRequest extends CIServiceRequest implements Serializable {

    /**
     * bucket名称
     */
    private String bucketName;
    /**
     * 任务的队列id
     */
    private String queueId;
    /**
     * 任务类型
     */
    private String tag;
    /**
     * 时间顺序
     */
    private String orderByTime;
    /**
     * 下一个token
     */
    private String nextToken;
    /**
     * 查询数量 默认为十个
     */
    private Integer size = 10;
    /**
     * 任务状态
     */
    private String states;
    /**
     * 开始时间
     */
    private String startCreationTime;
    /**
     * 结束时间
     */
    private String endCreationTime;
    /**
     * 任务id
     */
    private String jobId;
    /**
     * 任务id
     */
    private MediaInputObject input;
    /**
     * 任务id
     */
    private MediaJobOperation operation;


    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getQueueId() {
        return queueId;
    }

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getOrderByTime() {
        return orderByTime;
    }

    public void setOrderByTime(String orderByTime) {
        this.orderByTime = orderByTime;
    }

    public String getNextToken() {
        return nextToken;
    }

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public String getStartCreationTime() {
        return startCreationTime;
    }

    public void setStartCreationTime(String startCreationTime) {
        this.startCreationTime = startCreationTime;
    }

    public String getEndCreationTime() {
        return endCreationTime;
    }

    public void setEndCreationTime(String endCreationTime) {
        this.endCreationTime = endCreationTime;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public MediaInputObject getInput() {
        if (input == null) {
            input = new MediaInputObject();
        }
        return input;
    }

    public void setInput(MediaInputObject input) {
        this.input = input;
    }

    public MediaJobOperation getOperation() {
        if (operation == null) {
            operation = new MediaJobOperation();
        }
        return operation;
    }

    public void setOperation(MediaJobOperation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "MediaJobsRequest{" +
                "bucketName='" + bucketName + '\'' +
                ", queueId='" + queueId + '\'' +
                ", tag='" + tag + '\'' +
                ", orderByTime='" + orderByTime + '\'' +
                ", nextToken='" + nextToken + '\'' +
                ", size=" + size +
                ", states='" + states + '\'' +
                ", startCreationTime='" + startCreationTime + '\'' +
                ", endCreationTime='" + endCreationTime + '\'' +
                ", jobId='" + jobId + '\'' +
                ", input=" + input +
                '}';
    }
}
