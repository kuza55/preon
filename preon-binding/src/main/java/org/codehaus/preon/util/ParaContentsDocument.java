/**
 * Copyright (C) 2009-2010 Wilfred Springer
 *
 * This file is part of Preon.
 *
 * Preon is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2, or (at your option) any later version.
 *
 * Preon is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Preon; see the file COPYING. If not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Linking this library statically or dynamically with other modules is making a
 * combined work based on this library. Thus, the terms and conditions of the
 * GNU General Public License cover the whole combination.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent modules, and
 * to copy and distribute the resulting executable under terms of your choice,
 * provided that you also meet, for each linked independent module, the terms
 * and conditions of the license of that module. An independent module is a
 * module which is not derived from or based on this library. If you modify this
 * library, you may extend this exception to your version of the library, but
 * you are not obligated to do so. If you do not wish to do so, delete this
 * exception statement from your version.
 */
package org.codehaus.preon.util;

import org.codehaus.preon.el.Document;
import nl.flotsam.pecia.Documenter;
import nl.flotsam.pecia.Footnote;
import nl.flotsam.pecia.Para;

@SuppressWarnings("unchecked")
public class ParaContentsDocument implements Para {

    private Document document;

    public ParaContentsDocument(Document document) {
        this.document = document;
    }

    public Object end() {
        return null; // No relevant implementation
    }

    public Object getParent() {
        return null; // No relevant implementation
    }

    public Para code(String text) {
        document.text(text);
        return this;
    }

    public Para email(String email) {
        document.text(email);
        return this;
    }

    public Para emphasis(String text) {
        document.text(text);
        return this;
    }

    public Footnote footnote() {
        return null;
    }

    public Para link(Object id, String text) {
        document.link(id, text);
        return this;
    }

    public Para term(Object id, String text) {
        document.text(text);
        return this;
    }

    public Para text(String text) {
        document.text(text);
        return this;
    }

    public Para xref(String id) {
        return this;
    }

    public Para footnote(String footnote) {
        return this;
    }

    public Para document(Documenter documenter) {
        documenter.document(this);
        return this;
    }

}
