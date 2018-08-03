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

import java.util.List;

public final class ValueThreshold {

    private PhenotypeField phenotype;
    private Phenotype phenotypeNested;
    private Long lowerComp;
    private Long upperComp;

    private String lowerValue;

    private String upperValue;

    private String lowerUnits;
    private String upperUnits;
    private Long relationOperator;
    private List<PhenotypeField> relatedPhenotypes;
    private List<Phenotype> relatedPhenotypesNested;
    private Integer withinAtLeast;
    private Long withinAtLeastUnit;
    private Integer withinAtMost;
    private Long withinAtMostUnit;

    public PhenotypeField getPhenotype() {
        return phenotype;
    }

    public void setPhenotype(PhenotypeField phenotype) {
        this.phenotype = phenotype;
    }
    
    public Phenotype phenotypeNested() {
        return phenotypeNested;
    }

    public void setPhenotypeNested(Phenotype phenotypeNested) {
        this.phenotypeNested = phenotypeNested;
    }

    
    public Long getLowerComp() {
        return lowerComp;
    }

    public void setLowerComp(Long lowerComp) {
        this.lowerComp = lowerComp;
    }

    public Long getUpperComp() {
        return upperComp;
    }

    public void setUpperComp(Long upperComp) {
        this.upperComp = upperComp;
    }

    public String getLowerValue() {
        return lowerValue;
    }

    public void setLowerValue(String lowerValue) {
        this.lowerValue = lowerValue;
    }

    public String getUpperValue() {
        return upperValue;
    }

    public void setUpperValue(String upperValue) {
        this.upperValue = upperValue;
    }

    public String getLowerUnits() {
        return lowerUnits;
    }

    public void setLowerUnits(String lowerUnits) {
        this.lowerUnits = lowerUnits;
    }

    public String getUpperUnits() {
        return upperUnits;
    }

    public void setUpperUnits(String upperUnits) {
        this.upperUnits = upperUnits;
    }

    public Long getRelationOperator() {
        return relationOperator;
    }

    public void setRelationOperator(Long relationOperator) {
        this.relationOperator = relationOperator;
    }

    public List<PhenotypeField> getRelatedPhenotypes() {
        return relatedPhenotypes;
    }

    public void setRelatedPhenotypes(List<PhenotypeField> relatedPhenotypes) {
        this.relatedPhenotypes = relatedPhenotypes;
    }
    
    public List<Phenotype> getRelatedPhenotypesNested(){
        return this.relatedPhenotypesNested;
    }
    
    public void setRelatedPhenotypesNested(List<Phenotype> pe) {
        this.relatedPhenotypesNested = pe;
    }

    public Integer getWithinAtLeast() {
        return withinAtLeast;
    }

    public void setWithinAtLeast(Integer atLeastCount) {
        this.withinAtLeast = atLeastCount;
    }

    public Long getWithinAtLeastUnit() {
        return withinAtLeastUnit;
    }

    public void setWithinAtLeastUnit(Long atLeastTimeUnit) {
        this.withinAtLeastUnit = atLeastTimeUnit;
    }

    public Integer getWithinAtMost() {
        return withinAtMost;
    }

    public void setWithinAtMost(Integer atMostCount) {
        this.withinAtMost = atMostCount;
    }

    public Long getWithinAtMostUnit() {
        return withinAtMostUnit;
    }

    public void setWithinAtMostUnit(Long atMostTimeUnit) {
        this.withinAtMostUnit = atMostTimeUnit;
    }

    @Override
    public String toString() {
        return "ValueThreshold{" + "phenotype=" + phenotype + ", lowerComp=" + lowerComp + ", upperComp=" + upperComp + ", lowerValue=" + lowerValue + ", upperValue=" + upperValue + ", lowerUnits=" + lowerUnits + ", upperUnits=" + upperUnits + ", relationOperator=" + relationOperator + ", relatedPhenotypes=" + relatedPhenotypes + ", withinAtLeast=" + withinAtLeast + ", withinAtLeastUnit=" + withinAtLeastUnit + ", withinAtMost=" + withinAtMost + ", withinAtMostUnit=" + withinAtMostUnit + '}';
    }

}
