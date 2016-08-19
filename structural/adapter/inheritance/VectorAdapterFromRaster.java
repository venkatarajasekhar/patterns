package structural.adapter.inheritance;

import structural.adapter.RasterGraphics;
import structural.adapter.VectorGraphicsInterface;

public class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface{

    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}