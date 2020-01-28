import { TestBed } from '@angular/core/testing';

import { CovertService } from './covert.service';

describe('CovertService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CovertService = TestBed.get(CovertService);
    expect(service).toBeTruthy();
  });
});
