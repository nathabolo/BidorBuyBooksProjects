package com.example.bidorbuy.bidorbuybooksprojects.models;


import com.example.bidorbuy.bidorbuybooksprojects.MainActivity;

import java.util.List;

//This model contains trade information
public class TradeModel {

    private int totalResults, pageNumber, resultsPerPage, amount, userId, tradeId, homeCategoryId;
    private String images;
    private String image;
    private String title;
    private String type;
    private String categoryBreadCrumb;
    private String userAlias;
    private String closeTime;
    private String location;
    private String openTime;

    public String getThumnail() {
        return thumnail;
    }

    public void setThumnail(String thumnail) {
        this.thumnail = thumnail;
    }

    private String thumnail;
    private String status;
    private Boolean hotSelling;

    private List<TradeModel> tradeModelList;

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getResultsPerPage() {
        return resultsPerPage;
    }

    public void setResultsPerPage(int resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTradeId() {
        return tradeId;
    }

    public void setTradeId(int tradeId) {
        this.tradeId = tradeId;
    }

    public int getHomeCategoryId() {
        return homeCategoryId;
    }

    public void setHomeCategoryId(int homeCategoryId) {
        this.homeCategoryId = homeCategoryId;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategoryBreadCrumb() {
        return categoryBreadCrumb;
    }

    public void setCategoryBreadCrumb(String categoryBreadCrumb) {
        this.categoryBreadCrumb = categoryBreadCrumb;
    }

    public String getUserAlias() {
        return userAlias;
    }

    public void setUserAlias(String userAlias) {
        this.userAlias = userAlias;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getHotSelling() {
        return hotSelling;
    }

    public void setHotSelling(Boolean hotSelling) {
        this.hotSelling = hotSelling;
    }

    public List<TradeModel> getTradeList() {
        return tradeModelList;
    }

    public void setTradeList(List<TradeModel> tradeModelList) {
        this.tradeModelList = tradeModelList;
    }

    public void setName(String name) {
        this.images = name;
    }

    static class trade {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Trade {
    }
}
