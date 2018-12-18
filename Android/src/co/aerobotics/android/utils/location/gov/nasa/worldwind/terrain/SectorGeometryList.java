/*
 * Copyright (C) 2011 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */
package co.aerobotics.android.utils.location.gov.nasa.worldwind.terrain;

import android.graphics.Point;
import co.aerobotics.android.utils.location.gov.nasa.worldwind.geom.Sector;
import co.aerobotics.android.utils.location.gov.nasa.worldwind.render.DrawContext;

import java.util.List;

/**
 * @author dcollins
 * @version $Id$
 */
public interface SectorGeometryList extends List<SectorGeometry>
{
    Sector getSector();

    void beginRendering(DrawContext dc);

    void endRendering(DrawContext dc);

    void pick(DrawContext dc, Point pickPoint);
}
