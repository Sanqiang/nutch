/**
 * Copyright 2005 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.nutch.searcher;

import java.io.IOException;

import org.apache.hadoop.io.Closeable;
import org.apache.nutch.crawl.Inlinks;

/** Service that returns information about incoming links to a hit. */
public interface HitInlinks extends Closeable {
  /** Returns the anchors of a hit document. */
  String[] getAnchors(HitDetails details) throws IOException;

  /** Return the inlinks of a hit document. */
  Inlinks getInlinks(HitDetails details) throws IOException;
}