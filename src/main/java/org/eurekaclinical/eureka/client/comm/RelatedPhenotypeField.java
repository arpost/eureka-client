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

/**
 *
 * @author Andrew Post
 */
public final class RelatedPhenotypeField {

    private PhenotypeField phenotypeField;
    private Long relationOperator;
    private String sequentialPhenotype;
    private PhenotypeField sequentialPhenotypeField;
    private Long sequentialPhenotypeSource;
    private Integer relationMinCount;
    private Long relationMinUnits;
    private Integer relationMaxCount;
    private Long relationMaxUnits;

    public PhenotypeField getPhenotypeField() {
        return phenotypeField;
    }

    public void setPhenotypeField(PhenotypeField phenotype) {
        this.phenotypeField = phenotype;
    }

    public Long getRelationOperator() {
        return relationOperator;
    }

    public void setRelationOperator(Long relationOperator) {
        this.relationOperator = relationOperator;
    }

    public String getSequentialPhenotype() {
        return sequentialPhenotype;
    }

    public void setSequentialPhenotype(String rhsPhenotype) {
        this.sequentialPhenotype = rhsPhenotype;
    }

    public PhenotypeField getSequentialPhenotypeField() {
        return sequentialPhenotypeField;
    }

    public void setSequentialPhenotypeField(PhenotypeField rhsPhenotype) {
        this.sequentialPhenotypeField= rhsPhenotype;
    }

    public Integer getRelationMinCount() {
        return relationMinCount;
    }

    public Long getSequentialPhenotypeSource() {
        return sequentialPhenotypeSource;
    }

    public void setSequentialPhenotypeSource(Long inSequentialPhenotypeSource) {
        sequentialPhenotypeSource = inSequentialPhenotypeSource;
    }

    public void setRelationMinCount(Integer relationMinCount) {
        this.relationMinCount = relationMinCount;
    }

    public Long getRelationMinUnits() {
        return relationMinUnits;
    }

    public void setRelationMinUnits(Long relationMinUnits) {
        this.relationMinUnits = relationMinUnits;
    }

    public Integer getRelationMaxCount() {
        return relationMaxCount;
    }

    public void setRelationMaxCount(Integer relationMaxCount) {
        this.relationMaxCount = relationMaxCount;
    }

    public Long getRelationMaxUnits() {
        return relationMaxUnits;
    }

    public void setRelationMaxUnits(Long relationMaxUnits) {
        this.relationMaxUnits = relationMaxUnits;
    }

    @Override
    public String toString() {
        return "RelatedPhenotypeField{" + "phenotypeField=" + phenotypeField + ", relationOperator=" + relationOperator + ", sequentialPhenotype=" + sequentialPhenotype + ", sequentialPhenotypeSource=" + sequentialPhenotypeSource + ", relationMinCount=" + relationMinCount + ", relationMinUnits=" + relationMinUnits + ", relationMaxCount=" + relationMaxCount + ", relationMaxUnits=" + relationMaxUnits + '}';
    }
    
}
