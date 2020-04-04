/*
 * Copyright 2015 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.inferred.freebuilder.processor.property;

import static org.inferred.freebuilder.processor.GeneratedTypeSubject.assertThat;
import static org.inferred.freebuilder.processor.model.ClassTypeImpl.INTEGER;
import static org.inferred.freebuilder.processor.model.ClassTypeImpl.STRING;
import static org.inferred.freebuilder.processor.model.GenericTypeElementImpl.newTopLevelGenericType;
import static org.inferred.freebuilder.processor.model.PrimitiveTypeImpl.INT;
import static org.inferred.freebuilder.processor.model.WildcardTypeImpl.wildcardSuper;
import static org.inferred.freebuilder.processor.source.FunctionalType.consumer;

import com.google.common.collect.ImmutableBiMap;

import org.inferred.freebuilder.processor.BuilderFactory;
import org.inferred.freebuilder.processor.Datatype;
import org.inferred.freebuilder.processor.GeneratedBuilder;
import org.inferred.freebuilder.processor.model.GenericTypeElementImpl;
import org.inferred.freebuilder.processor.model.GenericTypeElementImpl.GenericTypeMirrorImpl;
import org.inferred.freebuilder.processor.source.QualifiedName;
import org.inferred.freebuilder.processor.source.feature.GuavaLibrary;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Optional;

@RunWith(JUnit4.class)
public class BiMapSourceTest {

  @Test
  public void test_guava() {
    assertThat(builder()).given(GuavaLibrary.AVAILABLE).generates(
        "// Autogenerated code. Do not modify.",
        "package com.example;",
        "",
        "import com.example.Person;",
        "import com.google.common.annotations.VisibleForTesting;",
        "import com.google.common.base.Preconditions;",
        "import com.google.common.collect.BiMap;",
        "import com.google.common.collect.HashBiMap;",
        "import com.google.common.collect.ImmutableBiMap;",
        "import com.google.common.collect.Maps;",
        "import java.util.Collection;",
        "import java.util.Map;",
        "import java.util.Objects;",
        "import java.util.function.Consumer;",
        "",
        "/** Auto-generated superclass of {@link Person.Builder}, "
            + "derived from the API of {@link Person}. */",
        "abstract class Person_Builder {",
        "",
        "  /**",
        "   * Creates a new builder using {@code value} as a template.",
        "   *",
        "   * <p>If {@code value} is a partial, the builder will return more partials.",
        "   */",
        "  public static Person.Builder from(Person value) {",
        "    if (value instanceof Rebuildable) {",
        "      return ((Rebuildable) value).toBuilder();",
        "    } else {",
        "      return new Person.Builder().mergeFrom(value);",
        "    }",
        "  }",
        "",
        "  private final HashBiMap<Integer, String> name = HashBiMap.create();",
        "",
        "  /**",
        "   * Associates {@code key} with {@code value} in the bimap to be returned from {@link",
        "   * Person#name()}. If the bimap previously contained a mapping for the key, the old value is",
        "   * replaced by the specified value.",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws IllegalArgumentException if the given value is already bound to a different key in this",
        "   *     bimap. The bimap will remain unmodified in this event. To avoid this exception, call {@link",
        "   *     #forcePut} instead.",
        "   * @throws NullPointerException if {@code value} is null",
        "   */",
        "  public Person.Builder putName(int key, String value) {",
        "    Objects.requireNonNull(value);",
        "    Preconditions.checkArgument(!name.containsValue(value), \"value already present: %s\", value);",
        "    forcePutName(key, value);",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Associates {@code key} with {@code value} in the bimap to be returned from {@link",
        "   * Person#name()}. See {@link BiMap#forcePut(Object, Object)}.",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code value} is null",
        "   */",
        "  public Person.Builder forcePutName(int key, String value) {",
        "    Objects.requireNonNull(value);",
        "    name.forcePut(key, value);",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Copies all of the mappings from {@code map} to the bimap to be returned from {@link",
        "   * Person#name()}.",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code map} is null or contains a null key or value",
        "   * @throws IllegalArgumentException if an attempt to {@code put} any entry fails. Note that some",
        "   *     map entries may have been added to the bimap before the exception was thrown.",
        "   */",
        "  public Person.Builder putAllName(Map<? extends Integer, ? extends String> map) {",
        "    for (Map.Entry<? extends Integer, ? extends String> entry : map.entrySet()) {",
        "      putName(entry.getKey(), entry.getValue());",
        "    }",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Removes the mapping for {@code key} from the bimap to be returned from "
            + "{@link Person#name()},",
        "   * if one is present.",
        "   *",
        "   * @return this {@code Builder} object",
        "   */",
        "  public Person.Builder removeKeyFromName(int key) {",
        "    name.remove(key);",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Removes the mapping for {@code value} from the bimap to be returned from "
            + "{@link Person#name()},",
        "   * if one is present.",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code value} is null",
        "   */",
        "  public Person.Builder removeValueFromName(String value) {",
        "    Objects.requireNonNull(value);",
        "    name.inverse().remove(value);",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Invokes {@code mutator} with the bimap to be returned from {@link Person#name()}.",
        "   *",
        "   * <p>This method mutates the bimap in-place. {@code mutator} is a void consumer, so any "
            + "value",
        "   * returned from a lambda will be ignored. Take care not to call pure functions, like "
            + "{@link",
        "   * Collection#stream()}.",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code mutator} is null",
        "   */",
        "  public Person.Builder mutateName(Consumer<? super BiMap<Integer, String>> mutator) {",
        "    // If forcePutName is overridden, this method will be updated to delegate to it",
        "    mutator.accept(name);",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Removes all of the mappings from the bimap to be returned from {@link Person#name()}.",
        "   *",
        "   * @return this {@code Builder} object",
        "   */",
        "  public Person.Builder clearName() {",
        "    name.clear();",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Returns an unmodifiable view of the bimap that will be returned by "
            + "{@link Person#name()}.",
        "   * Changes to this builder will be reflected in the view.",
        "   */",
        "  public BiMap<Integer, String> name() {",
        "    return Maps.unmodifiableBiMap(name);",
        "  }",
        "",
        "  /**",
        "   * Copies values from {@code value}, appending to collections.",
        "   *",
        "   * @return this {@code Builder} object",
        "   */",
        "  public Person.Builder mergeFrom(Person value) {",
        "    putAllName(value.name());",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Copies values from {@code template}, appending to collections.",
        "   *",
        "   * @return this {@code Builder} object",
        "   */",
        "  public Person.Builder mergeFrom(Person.Builder template) {",
        "    // Upcast to access private fields; otherwise, oddly, we get an access violation.",
        "    Person_Builder base = template;",
        "    putAllName(base.name);",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Resets the state of this builder.",
        "   *",
        "   * @return this {@code Builder} object",
        "   */",
        "  public Person.Builder clear() {",
        "    name.clear();",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /** Returns a newly-created {@link Person} based on the contents of this "
            + "{@code Builder}. */",
        "  public Person build() {",
        "    return new Value(this);",
        "  }",
        "",
        "  /**",
        "   * Returns a newly-created partial {@link Person} for use in unit tests. "
            + "State checking will not",
        "   * be performed.",
        "   *",
        "   * <p>The builder returned by {@link Person.Builder#from(Person)} will propagate the "
            + "partial",
        "   * status of its input, overriding {@link Person.Builder#build() build()} to return "
            + "another",
        "   * partial. This allows for robust tests of modify-rebuild code.",
        "   *",
        "   * <p>Partials should only ever be used in tests. "
            + "They permit writing robust test cases that won't",
        "   * fail if this type gains more application-level constraints "
            + "(e.g. new required fields) in",
        "   * future. If you require partially complete values in production code, "
            + "consider using a Builder.",
        "   */",
        "  @VisibleForTesting()",
        "  public Person buildPartial() {",
        "    return new Partial(this);",
        "  }",
        "",
        "  private abstract static class Rebuildable extends Person {",
        "    public abstract Person.Builder toBuilder();",
        "  }",
        "",
        "  private static final class Value extends Rebuildable {",
        "    private final ImmutableBiMap<Integer, String> name;",
        "",
        "    private Value(Person_Builder builder) {",
        "      this.name = ImmutableBiMap.copyOf(builder.name);",
        "    }",
        "",
        "    @Override",
        "    public BiMap<Integer, String> name() {",
        "      return name;",
        "    }",
        "",
        "    @Override",
        "    public Person.Builder toBuilder() {",
        "      Person_Builder builder = new Person.Builder();",
        "      builder.name.putAll(name);",
        "      return (Person.Builder) builder;",
        "    }",
        "",
        "    @Override",
        "    public boolean equals(Object obj) {",
        "      if (!(obj instanceof Value)) {",
        "        return false;",
        "      }",
        "      Value other = (Value) obj;",
        "      return Objects.equals(name, other.name);",
        "    }",
        "",
        "    @Override",
        "    public int hashCode() {",
        "      return Objects.hash(name);",
        "    }",
        "",
        "    @Override",
        "    public String toString() {",
        "      return \"Person{name=\" + name + \"}\";",
        "    }",
        "  }",
        "",
        "  private static final class Partial extends Rebuildable {",
        "    private final ImmutableBiMap<Integer, String> name;",
        "",
        "    Partial(Person_Builder builder) {",
        "      this.name = ImmutableBiMap.copyOf(builder.name);",
        "    }",
        "",
        "    @Override",
        "    public BiMap<Integer, String> name() {",
        "      return name;",
        "    }",
        "",
        "    private static class PartialBuilder extends Person.Builder {",
        "      @Override",
        "      public Person build() {",
        "        return buildPartial();",
        "      }",
        "    }",
        "",
        "    @Override",
        "    public Person.Builder toBuilder() {",
        "      Person_Builder builder = new PartialBuilder();",
        "      builder.name.putAll(name);",
        "      return (Person.Builder) builder;",
        "    }",
        "",
        "    @Override",
        "    public boolean equals(Object obj) {",
        "      if (!(obj instanceof Partial)) {",
        "        return false;",
        "      }",
        "      Partial other = (Partial) obj;",
        "      return Objects.equals(name, other.name);",
        "    }",
        "",
        "    @Override",
        "    public int hashCode() {",
        "      return Objects.hash(name);",
        "    }",
        "",
        "    @Override",
        "    public String toString() {",
        "      return \"partial Person{name=\" + name + \"}\";",
        "    }",
        "  }",
        "}");
  }

  private static GeneratedBuilder builder() {
    GenericTypeElementImpl bimap = newTopLevelGenericType("com.google.common.collect.BiMap");
    GenericTypeMirrorImpl mapIntString = bimap.newMirror(INTEGER, STRING);
    QualifiedName person = QualifiedName.of("com.example", "Person");
    QualifiedName generatedBuilder = QualifiedName.of("com.example", "Person_Builder");

    Datatype datatype = new Datatype.Builder()
        .setBuilder(person.nestedType("Builder").withParameters())
        .setExtensible(true)
        .setBuilderFactory(BuilderFactory.NO_ARGS_CONSTRUCTOR)
        .setBuilderSerializable(false)
        .setGeneratedBuilder(generatedBuilder.withParameters())
        .setInterfaceType(false)
        .setPartialType(generatedBuilder.nestedType("Partial").withParameters())
        .setPropertyEnum(generatedBuilder.nestedType("Property").withParameters())
        .setRebuildableType(generatedBuilder.nestedType("Rebuildable").withParameters())
        .setType(person.withParameters())
        .setValueType(generatedBuilder.nestedType("Value").withParameters())
        .build();
    Property name = new Property.Builder()
        .setAllCapsName("NAME")
        .setBoxedType(mapIntString)
        .setCapitalizedName("Name")
        .setFullyCheckedCast(true)
        .setGetterName("name")
        .setName("name")
        .setType(mapIntString)
        .setUsingBeanConvention(false)
        .build();

    return new GeneratedBuilder(datatype, ImmutableBiMap.of(
        name, new BiMapProperty(
            datatype,
            name,
            false,
            INTEGER,
            Optional.of(INT),
            STRING,
            Optional.empty(),
            consumer(wildcardSuper(mapIntString)))));
  }
}