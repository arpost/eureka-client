/*
 * #%L
 * Eureka Common
 * %%
 * Copyright (C) 2012 - 2013 Emory University
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.eurekaclinical.eureka.client.comm;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import org.eurekaclinical.eureka.client.comm.exception.PhenotypeHandlingException;

/**
 * Container class for the categorical user-created phenotype from the UI.
 * Essentially a direct mapping form the categorical element form fields.
 */
public final class Category extends Phenotype {

    public enum CategoricalType {
        CONSTANT, EVENT, PRIMITIVE_PARAMETER, LOW_LEVEL_ABSTRACTION,
        COMPOUND_LOW_LEVEL_ABSTRACTION, HIGH_LEVEL_ABSTRACTION, SLICE_ABSTRACTION,
        SEQUENTIAL_TEMPORAL_PATTERN_ABSTRACTION, MIXED, UNKNOWN
    }

    private List<PhenotypeField> children
            = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private CategoricalType categoricalType;

    public Category() {
        super(Phenotype.Type.CATEGORIZATION);
    }

    public List<PhenotypeField> getChildren() {
        return children;
    }

    public void setChildren(List<PhenotypeField> children) {
        this.children = children;
    }
    
    public CategoricalType getCategoricalType() {
        return categoricalType;
    }

    public void setCategoricalType(CategoricalType categoricalType) {
        this.categoricalType = categoricalType;
    }

    @Override
    public void accept(PhenotypeVisitor visitor)
            throws PhenotypeHandlingException {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Category{" + "children=" + children + ", categoricalType=" + categoricalType + '}';
    }
    
}
