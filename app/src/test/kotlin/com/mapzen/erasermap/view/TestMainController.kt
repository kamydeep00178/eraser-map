package com.mapzen.erasermap.view

import android.location.Location
import com.mapzen.pelias.gson.Feature

public class TestMainController : MainViewController {
    public var searchResults: List<Feature>? = null
    public var location: Location? = null
    public var zoom: Float = 0f
    public var tilt: Float = 0f
    public var rotation: Float = 0f

    public var isProgressVisible: Boolean = false
    public var isOverflowVisible: Boolean = false
    public var isViewAllVisible: Boolean = false
    public var isSearchVisible: Boolean = false
    public var isRoutePreviewVisible: Boolean = false
    public var isDirectionListVisible: Boolean = false
    public var isRoutingModeVisible: Boolean = false
    public var isCenteredOnCurrentFeature: Boolean = false
    public var isReverseGeocodeVisible: Boolean = false

    override fun showSearchResults(features: List<Feature>) {
        searchResults = features
    }

    override fun centerOnCurrentFeature(features: List<Feature>) {
        isCenteredOnCurrentFeature = true
    }

    override fun hideSearchResults() {
        searchResults = null
    }

    override fun showProgress() {
        isProgressVisible = true
    }

    override fun hideProgress() {
        isProgressVisible = false
    }

    override fun showOverflowMenu() {
        isOverflowVisible = true
    }

    override fun hideOverflowMenu() {
        isOverflowVisible = false
    }

    override fun showActionViewAll() {
        isViewAllVisible = true
    }

    override fun hideActionViewAll() {
        isViewAllVisible = false
    }

    override fun showAllSearchResults(features: List<Feature>) {
    }

    override fun collapseSearchView() {
        isSearchVisible = false
    }

    override fun showRoutePreview(location: Location, feature: Feature) {
        isRoutePreviewVisible = true
    }

    override fun hideRoutePreview() {
        isRoutePreviewVisible = false
    }

    override fun shutDown() {
    }

    override fun showDirectionList() {
        isDirectionListVisible = true
    }

    override fun hideRoutingMode() {
        isRoutingModeVisible = false
    }

    override fun showRoutingMode(feature: Feature) {
        isRoutingModeVisible = true
    }

    override fun centerMapOnLocation(location: Location, zoom: Float) {
        this.location = location
        this.zoom = zoom
    }

    override fun setMapTilt(radians: Float) {
        tilt = radians
    }

    override fun setMapRotation(radians: Float) {
        rotation = radians
    }

    override fun showReverseGeocodeFeature(features: List<Feature>) {
        isReverseGeocodeVisible = true
    }
}