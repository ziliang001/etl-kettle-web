/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: SvgImageUrl
 * Author:   zhuzj29042
 * Date:     2020/2/11 20:09::14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.ext.util;

import org.pentaho.di.core.plugins.PluginInterface;
import org.pentaho.di.ui.core.ConstUI;

import java.awt.image.BufferedImage;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/11 20:09:14
 * @since 1.0.0
 */
public class SvgImageUrl {

//	public static final String Size_Small = "small";
//	public static final String Size_Middle = "middle";

    public static String getSmallUrl(PluginInterface plugin) {
        return url(plugin.getImageFile(), ConstUI.SMALL_ICON_SIZE);
    }

    public static String getSmallUrl(String imageFile) {
        return url(imageFile, ConstUI.SMALL_ICON_SIZE);
    }

    public static String getMiddleUrl(String imageFile) {
        return url(imageFile, ConstUI.MEDIUM_ICON_SIZE);
    }

    public static String getMiddleUrl(PluginInterface plugin) {
        return url(plugin.getImageFile(), ConstUI.MEDIUM_ICON_SIZE);
    }

    public static String getUrl(PluginInterface plugin) {
        return url(plugin.getImageFile(), ConstUI.ICON_SIZE);
    }

    public static String getUrl(String imageFile) {
        return url(imageFile, ConstUI.ICON_SIZE);
    }

    public static String url(PluginInterface plugin, int scale) {
        return url(plugin.getImageFile(), scale);
    }

    public static String url(String imageFile, int scale) {
        if(imageFile == null)
            return null;

        if(!imageFile.startsWith("ui/images/"))
            imageFile = "ui/images/" + imageFile;
        return imageFile + "?scale=" + scale;
    }

    public static BufferedImage createImage(int scale) {
        return new BufferedImage(scale, scale, BufferedImage.TYPE_INT_ARGB);
    }
}
