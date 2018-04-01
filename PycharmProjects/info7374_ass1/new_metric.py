import keras.backend as K


def mean_pred(y_true, y_pred):
    return K.mean(y_pred)
def false_rates(y_true, y_pred):
    false_neg = 0.01
    false_pos = 0.01
    return {
        'false_neg': false_neg,
        'false_pos': false_pos,
    }