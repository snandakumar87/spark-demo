[when] thers is no formula value exists on the input =  not ScoreFormula( key == formulaNameFromScordCard ) from sc.params 

[then] apply Scoring Transformation for the given formula that has value = applyScoringTransformtion(sc,scData,formulaNameFromScordCard,xvalue);

[then] apply Scoring Transformation for the given formula value of Transx withMissingFormula = applyScoringTransformtionForTransxwithMissingFormula(sc,scData,formulaNameFromScordCard,xvalue);
[then] apply Scoring Transformation for the given formula value of Transx = applyScoringTransformtionForTransx(sc,scData,formulaNameFromScordCard);