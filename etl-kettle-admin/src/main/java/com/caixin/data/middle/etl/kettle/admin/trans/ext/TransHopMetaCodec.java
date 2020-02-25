/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: TransHopMetaCodec
 * Author:   zhuzj29042
 * Date:     2020/2/13 17:53::55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.trans.ext;

import com.caixin.data.middle.etl.kettle.ext.core.PropsUI;
import com.caixin.data.middle.etl.kettle.ext.util.SvgImageUrl;
import com.mxgraph.model.mxCell;
import com.mxgraph.util.mxUtils;
import org.pentaho.di.core.Const;
import org.pentaho.di.core.exception.KettleXMLException;
import org.pentaho.di.core.xml.XMLHandler;
import org.pentaho.di.laf.BasePropertyHandler;
import org.pentaho.di.trans.TransHopMeta;
import org.pentaho.di.trans.TransMeta;
import org.pentaho.di.trans.step.StepErrorMeta;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/13 17:53:55
 * @since 1.0.0
 */
public class TransHopMetaCodec {

    public static Element encode(TransHopMeta hop) {
        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.TRANS_HOP);

        e.setAttribute("from", hop.getFromStep().getName());
        e.setAttribute("to", hop.getToStep().getName());
        e.setAttribute("enabled", hop.isEnabled() ? "Y" : "N");

        StepErrorMeta stepErrorMeta = hop.getFromStep().getStepErrorMeta();
        if(stepErrorMeta != null && hop.getToStep().equals(stepErrorMeta.getTargetStep())) {
            e.setAttribute("label", SvgImageUrl.getSmallUrl(BasePropertyHandler.getProperty( "False_image" )));
        }

        return e;
    }

    public static TransHopMeta decode(TransMeta transMeta, mxCell cell) throws ParserConfigurationException, SAXException, IOException, KettleXMLException {
        StringBuilder retval = new StringBuilder();

        retval.append( "    " ).append( XMLHandler.openTag( "hop" ) ).append( Const.CR );
        retval.append( "      " ).append( XMLHandler.addTagValue( "from", cell.getAttribute("from") ) );
        retval.append( "      " ).append( XMLHandler.addTagValue( "to", cell.getAttribute("to") ) );
        retval.append( "      " ).append( XMLHandler.addTagValue( "enabled", "Y".equalsIgnoreCase(cell.getAttribute("enabled")) ) );
        retval.append( "    " ).append( XMLHandler.closeTag( "hop" ) ).append( Const.CR );

        StringReader sr = new StringReader(retval.toString());
        InputSource is = new InputSource(sr);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder=factory.newDocumentBuilder();
        Document doc = builder.parse(is);

        return new TransHopMeta(doc.getDocumentElement(), transMeta.getSteps());
    }

}
