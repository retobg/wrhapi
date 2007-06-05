/*
 * Copyright  2002-2006 WYMIWYG (http://wymiwyg.org)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.wymiwyg.wrhapi;


/**
 * @author reto
 */
public class HandlerException extends Exception {
    /**
    *
    */
    private static final long serialVersionUID = 3257846580244789048L;
    private ResponseStatus status;

    /**
     * @param status
     */
    public HandlerException(ResponseStatus status) {
        super();
        this.status = status;
    }

    /**
     * @param status
     */
    public HandlerException(ResponseStatus status, String message) {
        super(message);
        this.status = status;
    }

    public HandlerException(String message) {
        super(message);
        status = ResponseStatus.INTERNAL_SERVER_ERROR;
    }

    /**
     * @param message
     * @param arg1
     */
    public HandlerException(String message, Throwable thr) {
        super(message, thr);
        status = ResponseStatus.INTERNAL_SERVER_ERROR;
    }

    /**
     * @param message
     */
    public HandlerException(Throwable message) {
        super(message);
        status = ResponseStatus.INTERNAL_SERVER_ERROR;
    }

    public ResponseStatus getStatus() {
        return status;
    }
}