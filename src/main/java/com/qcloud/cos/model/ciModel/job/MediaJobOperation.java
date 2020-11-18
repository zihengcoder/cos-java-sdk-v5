package com.qcloud.cos.model.ciModel.job;

import com.qcloud.cos.model.ciModel.common.MediaOutputObject;
import com.qcloud.cos.model.ciModel.mediaInfo.MediaInfoObjcet;
import com.qcloud.cos.model.ciModel.template.MediaWatermark;

import java.util.ArrayList;
import java.util.List;

/**
 * 媒体处理 operation实体 https://cloud.tencent.com/document/product/460/48234
 */

public class MediaJobOperation {

    private String templateId;
    private MediaOutputObject output;
    private MediaAnimationObject mediaAnimation;
    private MediaInfoObjcet mediaInfo;
    private MediaRemoveWaterMark removeWatermark;
    private MediaWatermark watermark;
    private List<String> watermarkTemplateId;

    public MediaJobOperation() {
        this.output = new MediaOutputObject();
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public MediaOutputObject getOutput() {
        if (output == null) {
            output = new MediaOutputObject();
        }
        return output;
    }

    public void setOutput(MediaOutputObject output) {
        this.output = output;
    }

    public MediaAnimationObject getMediaAnimation() {
        if (mediaAnimation == null) {
            mediaAnimation = new MediaAnimationObject();
        }
        return mediaAnimation;
    }

    public MediaInfoObjcet getMediaInfo() {
        if (mediaInfo == null) {
            mediaInfo = new MediaInfoObjcet();
        }
        return mediaInfo;
    }

    public void setMediaInfo(MediaInfoObjcet mediaInfo) {
        this.mediaInfo = mediaInfo;
    }

    public MediaRemoveWaterMark getRemoveWatermark() {
        if (removeWatermark == null) {
            removeWatermark = new MediaRemoveWaterMark();
        }
        return removeWatermark;
    }

    public void setRemoveWatermark(MediaRemoveWaterMark removeWatermark) {
        this.removeWatermark = removeWatermark;
    }

    public void setMediaAnimation(MediaAnimationObject mediaAnimation) {
        this.mediaAnimation = mediaAnimation;
    }

    public MediaWatermark getWatermark() {
        if (watermark == null) {
            watermark = new MediaWatermark();
        }
        return watermark;
    }

    public void setWatermark(MediaWatermark watermark) {
        this.watermark = watermark;
    }


    public List<String> getWatermarkTemplateId() {
        if (watermarkTemplateId == null) {
            watermarkTemplateId = new ArrayList<>();
        }
        return watermarkTemplateId;
    }

    public void setWatermarkTemplateId(List<String> watermarkTemplateId) {
        this.watermarkTemplateId = watermarkTemplateId;
    }

    @Override
    public String toString() {
        return "MediaJobOperation{" +
                "templateId='" + templateId + '\'' +
                ", output=" + output +
                ", mediaAnimation=" + mediaAnimation +
                ", mediaInfo=" + mediaInfo +
                ", removeWatermark=" + removeWatermark +
                ", waterMark=" + watermark +
                ", watermarkTemplateId='" + watermarkTemplateId + '\'' +
                '}';
    }
}
