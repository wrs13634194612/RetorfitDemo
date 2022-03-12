package com.example.httpdemotwo;

import java.io.Serializable;
import java.util.List;

public class Post {
    /**
     * code : 200
     * Message : success
     * data : [{"blackout":"15","butNames":"按钮一","equipmentId":"zcz002103910","equipmentLabel":"客厅,主卧,次卧,卧室,厨房,阳台,洗手间,工作间","equipmentModelState":"","equipmentName":"一氧化碳(co)","equipmentNote":"一氧化碳(co)","equipmentState":"2","isOn":"1","productIcon":"http://112.74.48.180/wanYe/images/equipment/zczco.png","productId":"zcz002","productImage":"http://112.74.48.180/wanYe/images/product/co.jpg","productName":"","role":"1","specificEquipmentLabel":"客厅","warnOperate":"0","warnValue":"30"}]
     */

    private int code;
    private String Message;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        /**
         * blackout : 15
         * butNames : 按钮一
         * equipmentId : zcz002103910
         * equipmentLabel : 客厅,主卧,次卧,卧室,厨房,阳台,洗手间,工作间
         * equipmentModelState :
         * equipmentName : 一氧化碳(co)
         * equipmentNote : 一氧化碳(co)
         * equipmentState : 2
         * isOn : 1
         * productIcon : http://112.74.48.180/wanYe/images/equipment/zczco.png
         * productId : zcz002
         * productImage : http://112.74.48.180/wanYe/images/product/co.jpg
         * productName :
         * role : 1
         * specificEquipmentLabel : 客厅
         * warnOperate : 0
         * warnValue : 30
         */

        private String blackout;
        private String butNames;
        private String equipmentId;
        private String equipmentLabel;
        private String equipmentModelState;
        private String equipmentName;
        private String equipmentNote;
        private String equipmentState;
        private String isOn;
        private String productIcon;
        private String productId;
        private String productImage;
        private String productName;
        private String role;
        private String specificEquipmentLabel;
        private String warnOperate;
        private String warnValue;

        public String getBlackout() {
            return blackout;
        }

        public void setBlackout(String blackout) {
            this.blackout = blackout;
        }

        public String getButNames() {
            return butNames;
        }

        public void setButNames(String butNames) {
            this.butNames = butNames;
        }

        public String getEquipmentId() {
            return equipmentId;
        }

        public void setEquipmentId(String equipmentId) {
            this.equipmentId = equipmentId;
        }

        public String getEquipmentLabel() {
            return equipmentLabel;
        }

        public void setEquipmentLabel(String equipmentLabel) {
            this.equipmentLabel = equipmentLabel;
        }

        public String getEquipmentModelState() {
            return equipmentModelState;
        }

        public void setEquipmentModelState(String equipmentModelState) {
            this.equipmentModelState = equipmentModelState;
        }

        public String getEquipmentName() {
            return equipmentName;
        }

        public void setEquipmentName(String equipmentName) {
            this.equipmentName = equipmentName;
        }

        public String getEquipmentNote() {
            return equipmentNote;
        }

        public void setEquipmentNote(String equipmentNote) {
            this.equipmentNote = equipmentNote;
        }

        public String getEquipmentState() {
            return equipmentState;
        }

        public void setEquipmentState(String equipmentState) {
            this.equipmentState = equipmentState;
        }

        public String getIsOn() {
            return isOn;
        }

        public void setIsOn(String isOn) {
            this.isOn = isOn;
        }

        public String getProductIcon() {
            return productIcon;
        }

        public void setProductIcon(String productIcon) {
            this.productIcon = productIcon;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getProductImage() {
            return productImage;
        }

        public void setProductImage(String productImage) {
            this.productImage = productImage;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getSpecificEquipmentLabel() {
            return specificEquipmentLabel;
        }

        public void setSpecificEquipmentLabel(String specificEquipmentLabel) {
            this.specificEquipmentLabel = specificEquipmentLabel;
        }

        public String getWarnOperate() {
            return warnOperate;
        }

        public void setWarnOperate(String warnOperate) {
            this.warnOperate = warnOperate;
        }

        public String getWarnValue() {
            return warnValue;
        }

        public void setWarnValue(String warnValue) {
            this.warnValue = warnValue;
        }
    }
}
