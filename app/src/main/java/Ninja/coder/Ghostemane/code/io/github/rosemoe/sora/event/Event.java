/*
 *    sora-editor - the awesome code editor for Android
 *    https://github.com/Rosemoe/sora-editor
 *    Copyright (C) 2020-2022  Rosemoe
 *
 *     This library is free software; you can redistribute it and/or
 *     modify it under the terms of the GNU Lesser General Public
 *     License as published by the Free Software Foundation; either
 *     version 2.1 of the License, or (at your option) any later version.
 *
 *     This library is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *     Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public
 *     License along with this library; if not, write to the Free Software
 *     Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
 *     USA
 *
 *     Please contact Rosemoe by email 2073412493@qq.com if you need
 *     additional information or have any questions
 */
package io.github.rosemoe.sora.event;

import androidx.annotation.NonNull;

import java.util.Objects;

import io.github.rosemoe.sora.widget.CodeEditor;

/**
 * An Event object describes an event of editor.
 * It includes several attributes such as time and the editor object.
 * Subclasses of Event will define their own fields or methods.
 *
 * @author Rosemoe
 */
public abstract class Event {

    private final long mEventTime;
    private final CodeEditor mEditor;

    public Event(@NonNull CodeEditor editor) {
        this(editor, System.currentTimeMillis());
    }

    public Event(@NonNull CodeEditor editor, long eventTime) {
        mEditor = Objects.requireNonNull(editor);
        mEventTime = eventTime;
    }

    /**
     * Get event time
     */
    public long getEventTime() {
        return mEventTime;
    }

    /**
     * Get the editor
     */
    @NonNull
    public CodeEditor getEditor() {
        return mEditor;
    }

    /*
     * Checks whether this event can be intercepted (so that the event is not sent to other
     * receivers after being intercepted)
     */
    //abstract boolean canIntercept();

}
