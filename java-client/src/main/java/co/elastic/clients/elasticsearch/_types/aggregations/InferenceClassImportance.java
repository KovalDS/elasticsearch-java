/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.aggregations.InferenceClassImportance
@JsonpDeserializable
public class InferenceClassImportance implements JsonpSerializable {
	private final String className;

	private final double importance;

	// ---------------------------------------------------------------------------------------------

	private InferenceClassImportance(Builder builder) {

		this.className = ModelTypeHelper.requireNonNull(builder.className, this, "className");
		this.importance = ModelTypeHelper.requireNonNull(builder.importance, this, "importance");

	}

	public static InferenceClassImportance of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code class_name}
	 */
	public final String className() {
		return this.className;
	}

	/**
	 * Required - API name: {@code importance}
	 */
	public final double importance() {
		return this.importance;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("class_name");
		generator.write(this.className);

		generator.writeKey("importance");
		generator.write(this.importance);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InferenceClassImportance}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<InferenceClassImportance> {
		private String className;

		private Double importance;

		/**
		 * Required - API name: {@code class_name}
		 */
		public final Builder className(String value) {
			this.className = value;
			return this;
		}

		/**
		 * Required - API name: {@code importance}
		 */
		public final Builder importance(double value) {
			this.importance = value;
			return this;
		}

		/**
		 * Builds a {@link InferenceClassImportance}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferenceClassImportance build() {
			_checkSingleUse();

			return new InferenceClassImportance(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InferenceClassImportance}
	 */
	public static final JsonpDeserializer<InferenceClassImportance> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, InferenceClassImportance::setupInferenceClassImportanceDeserializer);

	protected static void setupInferenceClassImportanceDeserializer(
			ObjectDeserializer<InferenceClassImportance.Builder> op) {

		op.add(Builder::className, JsonpDeserializer.stringDeserializer(), "class_name");
		op.add(Builder::importance, JsonpDeserializer.doubleDeserializer(), "importance");

	}

}