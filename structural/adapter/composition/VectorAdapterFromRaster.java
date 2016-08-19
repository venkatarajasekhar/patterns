package structural.adapter.composition;

        import structural.adapter.RasterGraphics;
        import structural.adapter.VectorGraphicsInterface;

public class VectorAdapterFromRaster implements VectorGraphicsInterface {

    RasterGraphics graphics = new RasterGraphics();

    @Override
    public void drawLine() {
        graphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        graphics.drawRasterSquare();
    }
}
