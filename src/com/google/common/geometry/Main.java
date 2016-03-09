package com.google.common.geometry;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import org.timepedia.exporter.client.ExporterUtil;

public class Main implements EntryPoint {
	public void onModuleLoad() {
		GWT.create(MutableInteger.class);
		GWT.create(R1Interval.class);
		GWT.create(R2Vector.class);
		GWT.create(S1Angle.class);
		GWT.create(S1Interval.class);
		GWT.create(S2.class);
		GWT.create(S2.Metric.class);
		GWT.create(S2AreaCentroid.class);
		GWT.create(S2Cap.class);
		GWT.create(S2CellId.class);
		GWT.create(S2Cell.class);
		GWT.create(S2CellUnion.class);
		GWT.create(S2Edge.class);
		GWT.create(S2EdgeUtil.class);
		GWT.create(S2EdgeUtil.EdgeCrosser.class);
		GWT.create(S2EdgeUtil.RectBounder.class);
		GWT.create(S2EdgeUtil.XYZPruner.class);
		GWT.create(S2EdgeUtil.LongitudePruner.class);
		GWT.create(S2EdgeUtil.WedgeContains.class);
		GWT.create(S2EdgeUtil.WedgeIntersects.class);
		GWT.create(S2EdgeUtil.WedgeContainsOrIntersects.class);
		GWT.create(S2EdgeUtil.WedgeContainsOrCrosses.class);
		GWT.create(S2LatLng.class);
		GWT.create(S2LatLngRect.class);
		GWT.create(S2Loop.class);
		GWT.create(S2Point.class);
		GWT.create(S2PolygonBuilder.class);
		GWT.create(S2Polygon.class);
		GWT.create(S2Polyline.class);
		GWT.create(S2Projections.class);
		GWT.create(S2RegionCoverer.class);
		GWT.create(CellName.class);
		
		//ExporterUtil.exportAll();
		onLoad();
	}
	
	private native void onLoad() /*-{
		console.log($wnd, this);
	}-*/;
}
