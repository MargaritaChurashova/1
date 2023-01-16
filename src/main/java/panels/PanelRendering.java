package panels;

import controls.Label;
import io.github.humbleui.jwm.Event;
import io.github.humbleui.jwm.Window;
import io.github.humbleui.skija.Canvas;
import misc.CoordinateSystem2i;

import static app.Colors.PANEL_BACKGROUND_COLOR;
import static controls.Label.PANEL_PADDING;

/**
 * Панель управления
 */
public class PanelRendering extends GridPanel {
    /**
     * Заголовок
     */
    private final Label label;

    /**
     * Панель управления
     *
     * @param window     окно
     * @param drawBG     флаг, нужно ли рисовать подложку
     * @param color      цвет подложки
     * @param padding    отступы
     * @param gridWidth  кол-во ячеек сетки по ширине
     * @param gridHeight кол-во ячеек сетки по высоте
     * @param gridX      координата в сетке x
     * @param gridY      координата в сетке y
     * @param colspan    кол-во колонок, занимаемых панелью
     * @param rowspan    кол-во строк, занимаемых панелью
     */
    public PanelRendering(
            Window window, boolean drawBG, int color, int padding, int gridWidth, int gridHeight,
            int gridX, int gridY, int colspan, int rowspan
    ) {
        super(window, drawBG, color, padding, gridWidth, gridHeight, gridX, gridY, colspan, rowspan);

        // создаём первый заголовок
        label = new Label(window, false, PANEL_BACKGROUND_COLOR, PANEL_PADDING,
                1, 1, 0, 0, 1, 1, "Панель управления", true, true);


    }

    /**
     * Обработчик событий
     *
     * @param e событие
     */
    @Override
    public void accept(Event e) {

    }

    /**
     * Метод под рисование в конкретной реализации
     *
     * @param canvas   область рисования
     * @param windowCS СК окна
     */
    @Override
    public void paintImpl(Canvas canvas, CoordinateSystem2i windowCS) {
        label.paint(canvas, windowCS);
    }
}