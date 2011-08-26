/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    
package org.odftoolkit.odfdom.dom.type.presentation;

public enum OdfTransitionStyleType
{
              ROLL_FROM_LEFT( "roll-from-left" ), STRETCH_FROM_TOP( "stretch-from-top" ), ROLL_FROM_RIGHT( "roll-from-right" ), SPIRALIN_LEFT( "spiralin-left" ), MOVE_FROM_LOWERLEFT( "move-from-lowerleft" ), FADE_FROM_LOWERRIGHT( "fade-from-lowerright" ), OPEN( "open" ), MOVE_FROM_UPPERRIGHT( "move-from-upperright" ), MOVE_FROM_UPPERLEFT( "move-from-upperleft" ), HORIZONTAL_LINES( "horizontal-lines" ), FADE_FROM_BOTTOM( "fade-from-bottom" ), CLOSE_VERTICAL( "close-vertical" ), UNCOVER_TO_BOTTOM( "uncover-to-bottom" ), MOVE_FROM_LOWERRIGHT( "move-from-lowerright" ), INTERLOCKING_VERTICAL_TOP( "interlocking-vertical-top" ), INTERLOCKING_HORIZONTAL_LEFT( "interlocking-horizontal-left" ), UNCOVER_TO_UPPERRIGHT( "uncover-to-upperright" ), FADE_FROM_RIGHT( "fade-from-right" ), UNCOVER_TO_LOWERLEFT( "uncover-to-lowerleft" ), NONE( "none" ), MELT( "melt" ), VERTICAL_CHECKERBOARD( "vertical-checkerboard" ), STRETCH_FROM_BOTTOM( "stretch-from-bottom" ), WAVYLINE_FROM_TOP( "wavyline-from-top" ), FADE_FROM_CENTER( "fade-from-center" ), SPIRALOUT_RIGHT( "spiralout-right" ), SPIRALIN_RIGHT( "spiralin-right" ), MOVE_FROM_RIGHT( "move-from-right" ), UNCOVER_TO_TOP( "uncover-to-top" ), MOVE_FROM_LEFT( "move-from-left" ), COUNTERCLOCKWISE( "counterclockwise" ), INTERLOCKING_VERTICAL_BOTTOM( "interlocking-vertical-bottom" ), UNCOVER_TO_LOWERRIGHT( "uncover-to-lowerright" ), VERTICAL_LINES( "vertical-lines" ), CLOSE( "close" ), CLOCKWISE( "clockwise" ), OPEN_VERTICAL( "open-vertical" ), OPEN_HORIZONTAL( "open-horizontal" ), WAVYLINE_FROM_LEFT( "wavyline-from-left" ), WAVYLINE_FROM_BOTTOM( "wavyline-from-bottom" ), FADE_FROM_UPPERLEFT( "fade-from-upperleft" ), MOVE_FROM_BOTTOM( "move-from-bottom" ), STRETCH_FROM_RIGHT( "stretch-from-right" ), UNCOVER_TO_UPPERLEFT( "uncover-to-upperleft" ), WAVYLINE_FROM_RIGHT( "wavyline-from-right" ), INTERLOCKING_HORIZONTAL_RIGHT( "interlocking-horizontal-right" ), FADE_FROM_LEFT( "fade-from-left" ), CLOSE_HORIZONTAL( "close-horizontal" ), STRETCH_FROM_LEFT( "stretch-from-left" ), HORIZONTAL_STRIPES( "horizontal-stripes" ), SPIRALOUT_LEFT( "spiralout-left" ), UNCOVER_TO_RIGHT( "uncover-to-right" ), VERTICAL_STRIPES( "vertical-stripes" ), FADE_FROM_TOP( "fade-from-top" ), DISSOLVE( "dissolve" ), ROLL_FROM_BOTTOM( "roll-from-bottom" ), FADE_FROM_LOWERLEFT( "fade-from-lowerleft" ), MOVE_FROM_TOP( "move-from-top" ), FADE_FROM_UPPERRIGHT( "fade-from-upperright" ), UNCOVER_TO_LEFT( "uncover-to-left" ), HORIZONTAL_CHECKERBOARD( "horizontal-checkerboard" ), ROLL_FROM_TOP( "roll-from-top" ), FLY_AWAY( "fly-away" ), RANDOM( "random" ), FADE_TO_CENTER( "fade-to-center" );

    private String m_aValue;

    OdfTransitionStyleType( String _aValue )
    {
        m_aValue = _aValue;
    }

    public String toString()
    {
        return m_aValue;
    }

    public static String toString( OdfTransitionStyleType _aEnum )
    {
        return _aEnum.toString();
    }

    public static OdfTransitionStyleType enumValueOf( String _aString )
    {
        for( OdfTransitionStyleType aIter : values() )
        {
            if( _aString.equals( aIter.toString() ) )
            {
                return aIter;
            }
        }
        return null;
    }

}