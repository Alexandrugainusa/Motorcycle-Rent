create table motorcyclerent.motorcycleFeatures
(
    motoFeatureId int(5)     not null,
    featureId   int(5) not null,
    PRIMARY KEY (motoFeatureId, featureId),
    FOREIGN KEY (motoFeatureId) REFERENCES motorcyclerent.motorcycle (motorcycleId),
    FOREIGN KEY (featureId) REFERENCES motorcyclerent.features (featuresId)
);